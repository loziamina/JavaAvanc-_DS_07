module jsp.playerchessjavadst {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens jsp.playerchessjavadst to javafx.fxml;
    exports jsp.playerchessjavadst;
}
