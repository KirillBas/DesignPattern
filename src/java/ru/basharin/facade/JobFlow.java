package ru.basharin.facade;

public class JobFlow {
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();
    private JavaDeveloper javaDeveloper = new JavaDeveloper();

    public void startWork() {
        job.doWork();
        bugTracker.startTask();
        javaDeveloper.doWorkToTask(bugTracker);
    }
}
