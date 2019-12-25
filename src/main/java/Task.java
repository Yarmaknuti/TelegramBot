public class Task {


    public String Communication;
    public String lastMessaage;
    public String Description;

    public String getCommunication() {
        return Communication;
    }

    public void setCommunication(String communication) {
        Communication = communication;
    }

    public String getLastMessaage() {
        return lastMessaage;
    }

    public  void setLastMessaage(String lastMessaage) {
        this.lastMessaage = lastMessaage;
    }

    public String getDescription() {
        return Description;
    }

    public  void setDescription(String description) {
        Description = description;
    }
    public  Task(){}

    public  String showTask(){
        return "Описание проблемы:" + getDescription() + "\n" +
                "Cвязь: "+getCommunication();
    }


}
