package am.developer.bean;

import io.swagger.annotations.ApiModelProperty;

public class MessageBean {

    @ApiModelProperty(notes = "Provided user name", required =true)
    private String player;

    @ApiModelProperty(notes = "The system generated greeting message" , readOnly =true)
    private String message;

    public MessageBean(String player, String message) {
        this.player = player;
        this.message = message;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
