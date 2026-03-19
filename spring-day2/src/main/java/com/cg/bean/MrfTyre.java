package com.cg.bean;

import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements ITyre {
    @Override
    public String getTyreDetails() {
        return "MRF Tyre 1400";
    }
}

