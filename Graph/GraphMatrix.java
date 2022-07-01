

//Graph: Adjacency Matrix Representation
public class GraphMatrix {

    private boolean matrix[][];
    private int vertices;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new boolean[vertices][vertices];
    }

    public void edge(int i, int j) {
        matrix[i][j] = true;
        matrix[j][i] = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vertices; i++) {
            sb.append(i + " ");
            for (boolean j : matrix[i]) {
                sb.append((j ? 1 : 0) + " ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        GraphMatrix obj = new GraphMatrix(4);
        obj.edge(0, 1);
        obj.edge(0, 2);
        obj.edge(1, 2);
        obj.edge(2, 0);
        obj.edge(2, 3);
        obj.edge(0, 3);
        System.out.print(obj.toString());
    }

}