package pages.components;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class FileComponent {
    public void uploadPhoto(String address,  String photoName) {
        File file = new File(address+photoName);
        $("#uploadPicture").uploadFile(file);
    }
}
