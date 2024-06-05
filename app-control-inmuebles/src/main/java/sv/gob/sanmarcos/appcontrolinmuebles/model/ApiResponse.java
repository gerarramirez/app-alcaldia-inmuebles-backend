package sv.gob.sanmarcos.appcontrolinmuebles.model;


import lombok.Data;

@Data
public class ApiResponse {

    private String message;
    private boolean status;

    public ApiResponse(String string, boolean b) {
        // TODO Auto-generated constructor stub
    }
}
