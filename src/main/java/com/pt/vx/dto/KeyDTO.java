package com.pt.vx.dto;

import com.pt.vx.entity.DataInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@AllArgsConstructor
@Data
public class KeyDTO extends DataInfo {
    private String key;

    private boolean open;


    public boolean equalsKey(KeyDTO o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(key, o.getKey());
    }


}
