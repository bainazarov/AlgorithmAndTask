package team.mediasoft.intership.algorythms.algorithmandtask.logisticcompany.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Cargo {
    String type;
    Double dimensions;
    Double weight;
}