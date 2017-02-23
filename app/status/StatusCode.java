package status;

public enum StatusCode {

    ADD_SETTLEMENT_SUCCESS(true, "Successfully added settlement in the current location."),
    ADD_SETTLEMENT_FAILURE(false, "Cannot add settlement in the current location."),
    UPGRADE_CITY_SUCCESS(false, "Successfully upgraded settlement to city."),
    UPGRADE_CITY_FAILURE(false, "Cannot upgrade settlement to city"),
    ADD_ROAD_SUCCESS(true, "Successfully added road in the current location."),
    ADD_ROAD_FAILURE(false, "Cannot add road in the current location."),
    UPGRADE_CITY_SUCCESS(false, "Successfully upgraded settlement to city."),
    UPGRADE_CITY_FAILURE(false, "Cannot upgrade settlement to city"),
    MOVE_ROBBER_SUCCESS(false, "Successfully moved robber."),
    MOVE_ROBBER_FAILURE(false, "Cannot move robber"),
    MOVE_PORT_SUCCESS(false, "Successfully moved port."),
    MOVE_PORT_FAILURE(false, "Cannot move port"),
    GET_DEVELOPMENT_CARD_SUCCESS(false, "Successfully picked development card."),
    GET_DEVELOPMENT_CARD_FAILURE(false, "Cannot pick development card."),
    USE_DEVELOPMENT_CARD_SUCCESS(false, "Successfully used development card."),
    USE_DEVELOPMENT_CARD_FAILURE(false, "Cannot use development card."),
    MOVE_PORT_SUCCESS(false, "Successfully moved port."),
    MOVE_PORT_FAILURE(false, "Cannot move port"),
    ROLL_DICE_SUCCESS(false, "Successfully rolled dice."),
    ROLL_DICE_FAILURE(false, "Cannot roll dice"),
    WIN_GAME_SUCCESS(false, "You won the game."),
    WIN_GAME_FAILURE(false, "Failed to win the game WTF does this even mean");

    private final Boolean success;
    private final String description;

    private StatusCode(Boolean success, String description) {
        this.success = success;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean getSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return description;
    }
}
