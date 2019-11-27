package jxnu.wr.model;


public class Proj {
    int project_id;
    String project_name;
    String time;
    int initiator_id;

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getInitiator_id() {
        return initiator_id;
    }

    public void setInitiator_id(int initiator_id) {
        this.initiator_id = initiator_id;
    }
}
