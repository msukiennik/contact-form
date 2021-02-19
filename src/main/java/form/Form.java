package form;

public class Form {

    public String voiceNumber;
    public String productSymbol;
    public String content;
    public String email;
    public String telephone;

    public Form (String voiceNumber, String productSymbol, String content, String email, String telephone) {
        this.voiceNumber = voiceNumber;
        this.productSymbol = productSymbol;
        this.content = content;
        this.email = email;
        this.telephone = telephone;
    }

    public Form () {

    }

    public String getVoiceNumber() {
        return voiceNumber;
    }

    public void setVoiceNumber(String voiceNumber) {
        this.voiceNumber = voiceNumber;
    }

    public String getProductSymbol() {
        return productSymbol;
    }

    public void setProductSymbol(String productSymbol) {
        this.productSymbol = productSymbol;
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
