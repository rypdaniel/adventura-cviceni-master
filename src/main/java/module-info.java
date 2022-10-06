module cz.vse.xname.adventura0730 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.vse.rypd01.adventura to javafx.fxml;
    exports cz.vse.rypd01.adventura;
}