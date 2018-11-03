package ru.basharin.observer;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancies("PHP developer");
        jobSite.addVacancies("Java developer");
        jobSite.addVacancies("C++ developer");
        jobSite.addVacancies("Net developer");

        Observer subscriberFirst = new Subscriber("Kirill");
        Observer subscriberSecond = new Subscriber("Billi");

        jobSite.addObserver(subscriberFirst);
        jobSite.addObserver(subscriberSecond);

        jobSite.addVacancies("Dream work!");

        jobSite.removeVacancy("Net developer");
    }
}
