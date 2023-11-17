package com.lyc.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NameResponse extends ResultResponse {
    private static final long serialVersionUID = -1038984103811824271L;
    private String name;
}
