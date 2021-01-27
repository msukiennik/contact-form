package form;

public class Form {

    protected String topic;
    protected String content;
    protected String email;
    protected String telephone;

    public Form (String topic, String content, String email, String telephone) {
        this.topic = topic;
        this.content = content;
        this.email = email;
        this.telephone = telephone;
    }

    public Form () {

    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
