package co.edu.poli.objectPool.model;

public class GiantPool extends ObjectPool<Giant> {

	@Override
	protected Giant create() {
		return new Giant();
	}

}
