/* Copyright (c) 2024, Charles T. */

module morpion {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports abitodyssey.morpion;

    opens abitodyssey.morpion to javafx.fxml;
}
