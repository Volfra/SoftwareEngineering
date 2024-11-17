package co.edu.poli.factoryReflection.model;

public enum TipoCuentas {

	C {
		public String toString() {
			return "co.edu.poli.factoryReflection.model.Corriente";
		}
	},
	A {
		public String toString() {
			return "co.edu.poli.factoryReflection.model.Ahorro";
		}
	},
	E {
		public String toString() {
			return "co.edu.poli.factoryReflection.model.Empresarial";
		}
	}
	

}
