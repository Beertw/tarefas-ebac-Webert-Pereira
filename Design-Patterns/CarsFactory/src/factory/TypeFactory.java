package factory;

import cars.*;

public interface TypeFactory {
    Sedan createSedan();
    SUV createSUV();
    Sport createSport();
}
