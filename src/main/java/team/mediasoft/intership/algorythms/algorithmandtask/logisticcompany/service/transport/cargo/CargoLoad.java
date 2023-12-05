package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.service.transport.cargo;

import team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto.Cargo;

public interface CargoLoad {

    void loadCargo(Cargo cargo);
    void unloadCargo(Cargo cargo);
}
