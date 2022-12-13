module com.example.Brick_Breaker_Game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Brick_Breaker_Game to javafx.fxml;
    exports com.example.Brick_Breaker_Game;
}