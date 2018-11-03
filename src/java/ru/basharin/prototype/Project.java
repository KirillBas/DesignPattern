package ru.basharin.prototype;

public class Project implements CopyProject{

    private int id;
    private String projectName;
    private String projectCode;

    public Project(int id, String projectName, String projectCode) {
        this.id = id;
        this.projectName = projectName;
        this.projectCode = projectCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Override
    public Object copy() {
        return new Project(id, projectName, projectCode);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectCode='" + projectCode + '\'' +
                '}';
    }
}
