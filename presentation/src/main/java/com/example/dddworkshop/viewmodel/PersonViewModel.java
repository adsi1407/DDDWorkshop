package com.example.dddworkshop.viewmodel;

import android.os.AsyncTask;
import android.util.Log;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.application.service.PersonApplicationService;
import com.example.domain.aggregate.Person;

public class PersonViewModel extends ViewModel {

    private MutableLiveData<Boolean> personSaved;

    private final PersonApplicationService personService;

    @ViewModelInject
    public PersonViewModel(PersonApplicationService personService) {
        this.personService = personService;
    }

    public LiveData<Boolean> executeSavePerson(Person person) {

        if (personSaved == null) {
            personSaved = new MutableLiveData<>();
            savePerson(person);
        }
        return personSaved;
    }

    private void savePerson(Person person) {

        PersonAsyncTask personAsyncTask = new PersonAsyncTask();
        personAsyncTask.execute(person);
    }

    class PersonAsyncTask extends AsyncTask<Person, String, Boolean> {

        @Override
        protected Boolean doInBackground(Person... people) {

            try {
                personService.savePerson(people[0]);
                return true;
            }
            catch (Exception ex) {
                Log.println(Log.ERROR, PersonViewModel.class.getName(), ex.getMessage());
                return false;
            }
        }

        @Override
        protected void onPostExecute(Boolean saved) {
            personSaved.setValue(saved);
        }
    }
}
