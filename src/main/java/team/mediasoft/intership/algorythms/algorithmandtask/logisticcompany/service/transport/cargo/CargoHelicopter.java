package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.cargo;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Cargo;
import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.Transport;

public class CargoHelicopter implements Transport,CargoLoad {
    @Override
    public void move() {
        System.out.println("Грузовой вертолет перемещается");
    }

    @Override
    public void loadCargo(Cargo cargo) {
        System.out.println("Грузовой вертолет загружен грузом: " + cargo.getType());
    }

    @Override
    public void unloadCargo(Cargo cargo) {
        System.out.println("Грузовой вертолет разгружен");
    }
}
