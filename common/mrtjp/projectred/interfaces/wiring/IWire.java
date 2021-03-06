package mrtjp.projectred.interfaces.wiring;

/**
 * Marker interface for wire tile entities.
 * Other mods should not implement this, nor any sub-interface.
 */
public interface IWire {
	/**
	 * blockFace can be -1 to check freestanding wire connections.
	 */
	public boolean wireConnectsInDirection(int blockFace, int direction);
}
