package tetris;

public interface EventProcessor {

	void moveLeft();

	void moveRight();

	void slideDownOneRow();

	void rotate();

	void dropDown();

}