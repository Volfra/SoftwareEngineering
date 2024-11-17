package co.edu.poli.factoryreflection.model;

public enum TipoCuentas {

	C {
		public String toString() {
			return "co.edu.poli.factoryreflection.model.Corriente";
		}
	},
	A {
		public String toString() {
			return "co.edu.poli.factoryreflection.model.Ahorro";
		}
	},
	E {
		public String toString() {
			return "co.edu.poli.factoryreflection.model.Empresarial";
		}
	}
	

}
