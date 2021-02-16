package pratice;

import java.io.IOException;

public interface Sort {
	
	void ascending();
	void descending();
	void description();
	
	default void run() {
		ascending();
		descending();
		description();
	}

}