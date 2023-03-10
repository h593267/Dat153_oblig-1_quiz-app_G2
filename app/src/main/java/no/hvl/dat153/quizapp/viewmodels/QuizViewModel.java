package no.hvl.dat153.quizapp.viewmodels;

import android.app.Application;
import android.widget.ProgressBar;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import no.hvl.dat153.quizapp.db.AnimalRepository;
import no.hvl.dat153.quizapp.model.Animal;

public class QuizViewModel extends AndroidViewModel {

    private final AnimalRepository repository;
    private final LiveData<List<Animal>> allAnimals;
    private int correctnameplace;
    private int index = -1;
    private int counter;
    private int countercorrect;
    private String correctname;
    private int progress = 0;
    private int option1;
    private int option2;
    private ProgressBar progressBar;

    public ProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(ProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public int getOption1() {
        return option1;
    }

    public void setOption1(int option1) {
        this.option1 = option1;
    }

    public int getOption2() {
        return option2;
    }

    public void setOption2(int option2) {
        this.option2 = option2;
    }

    public int getCorrectnameplace() {
        return correctnameplace;
    }

    public void setCorrectnameplace(int correctnameplace) {
        this.correctnameplace = correctnameplace;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCountercorrect() {
        return countercorrect;
    }

    public void setCountercorrect(int countercorrect) {
        this.countercorrect = countercorrect;
    }

    public String getCorrectname() {
        return correctname;
    }

    public void setCorrectname(String correctname) {
        this.correctname = correctname;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public QuizViewModel(Application application) {
        super(application);
        repository = new AnimalRepository(application);
        allAnimals = repository.getAllAnimals();
        counter=0;
        countercorrect=0;
    }


    public LiveData<List<Animal>> getAllAnimals() {
        return allAnimals;
    }

    public void insertAnimal(Animal animal) {
        repository.insertAnimal(animal);
    }

    public void findAnimal(String name) {
        repository.findAnimal(name);
    }

    public void deleteAnimal(Animal animal) {
        repository.deleteAnimal(animal);
    }

}