package com.example.algamoney.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("algamoney")
public class AlgamoneyApiProperty {

	private String origenPermitida = "http://localhost:8000";
	
    private final Seguranca seguranca = new Seguranca();

    public Seguranca getSeguranca() {
        return seguranca;
    }

    public String getOrigenPermitida() {
		return origenPermitida;
	}

	public void setOrigenPermitida(String origenPermitida) {
		this.origenPermitida = origenPermitida;
	}

	public static class Seguranca {

        private boolean enableHttps;

        public boolean isEnabledHttps() {
            return enableHttps;
        }

        public void setEnableHttps(boolean enableHttps) {
            this.enableHttps = enableHttps;
        }
    }
}
