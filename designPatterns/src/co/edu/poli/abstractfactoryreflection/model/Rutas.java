package co.edu.poli.abstractfactoryreflection.model;

public enum Rutas {

	CtaCorriente {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.CuentaCorriente";
		}
	},
	CtaAhorro {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.CuentaAhorro";
		}
	},
	CtaEmpresarial {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.CuentaEmpresarial";
		}
	},
	ChqCruzado {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.ChequeCruzado";
		}
	},
	ChqViajero {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.ChequeViajero";
		}
	},
	ChqPortador {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.ChequePortador";
		}
	},
	CrdCortoPlazo {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.CreditoCortoPlazo";
		}
	},
	CrdLargoPLazo {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.CreditoLargoPlazo";
		}
	},
	Portafolio {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.PortafolioImpl";
		}
	}
}
