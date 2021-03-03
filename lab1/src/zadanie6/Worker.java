package zadanie6;
public abstract class Worker {
    Work work;
    GoToWork goToWork;
    FreeTime freeTime;
    String profession;
    public void setProfession(String pr) {
        profession = pr;
    }
    public void setWork (Work w) {
         work = w;
    }
    public void setGoToWork (GoToWork gtw) {
        goToWork = gtw;
    }
    public void setFreeTime (FreeTime ft) {
        freeTime = ft;
    }
    public void car (GoToWork gtw) {
        goToWork = gtw;
    }
}
