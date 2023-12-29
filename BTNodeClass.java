class BTNode {
    String text;
    BTNode yes;
    BTNode no;

    BTNode(String text) {
        this.text = text;
        this.yes = null;
        this.no = null;
    }
}
