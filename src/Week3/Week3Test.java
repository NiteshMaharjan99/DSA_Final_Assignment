package Week3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class Week3Test {
	@Test
	void test1() {
		
		int V = 6; // Number of vertices in graph
        int E = 5; // Number of edges in graph
        Week3 graph = new Week3(V, E);

        // add edge 0-1
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 4;

        // add edge 1-2
        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 9;

        // add edge 1-3
        graph.edge[2].src = 1;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 4;

        // add edge 3-4
        graph.edge[3].src = 3;
        graph.edge[3].dest = 4;
        graph.edge[3].weight = 3;

        // add edge 4-5
        graph.edge[4].src = 4;
        graph.edge[4].dest = 5;
        graph.edge[4].weight = 4;
		
	    int result = graph.KruskalMST();
	    
	    assertEquals(result, 24);
	}
}
