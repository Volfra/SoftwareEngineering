package co.edu.poli.abstractfactoryreflection.model;

public enum Properties {

	CtaCorriente {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.Corriente";
		}
	},
	CtaAhorro {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.Ahorro";
		}
	},
	CtaEmpresarial {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.Empresarial";
		}
	},
	ChqCruzado {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.Cruzado";
		}
	},
	ChqViajero {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.Viajero";
		}
	},
	ChqPortador {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.Portador";
		}
	},
	Portafolio {
		public String toString() {
			return "co.edu.poli.abstractfactoryreflection.model.PortafolioImpl";
		}
	}
}
