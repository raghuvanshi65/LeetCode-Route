class Solution {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) return false;
        int h = board.length;
        int w = board[0].length;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (search(board, word, 0, i, j, w, h)) {
                    return true;
                }
            }
        }
        return false;

    }

    private boolean search(char[][] board, String word, int d, int x, int y, int w, int h) {
        // out of bound
        if (x < 0 || x == w || y < 0 || y == h || word.charAt(d) != board[y][x]) {
            return false;
        }
        if (d == word.length() - 1) {
            return true; // last word
        }
        char current = board[y][x];
        board[y][x] = 0;
        Boolean found = search(board, word, d + 1, x + 1, y, w, h) ||
                        search(board, word, d + 1, x - 1, y, w, h) ||
                        search(board, word, d + 1, x, y + 1, w, h) ||
                        search(board, word, d + 1, x, y - 1, w, h);
        board[y][x] = current;
        return found;

    }
}