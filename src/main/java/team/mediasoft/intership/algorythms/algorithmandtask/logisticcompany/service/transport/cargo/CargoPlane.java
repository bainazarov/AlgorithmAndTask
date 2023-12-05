package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.cargo;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Cargo;
import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.Transport;

public class CargoPlane implements Transport,CargoLoad {
    @Override
    public void loadCargo(Cargo cargo) {
        System.out.println("Грузовой самолет загружен грузом: " + cargo.getType());
    }

    @Override
    public void unloadCargo(Cargo cargo) {
        System.out.println("Грузовой самолет разгружен");
    }

    @Override
    public void move() {
        System.out.println("Грузовой самолет перемещается");
    }
}
