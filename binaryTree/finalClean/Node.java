/**
 * Copyright
 * @author 349604207@gapps.yrdsb.ca
 *                                                                              ,----,
 *                             ,----..                                        ,/   .`|
 *               ,-.----.     /   /   \      ,---,.     ,---,.,-.----.      ,`   .'  :
 *               \    /  \   /   .     :   ,'  .'  \  ,'  .' |\    /  \   ;    ;     /
 *               ;   :    \ .   /   ;.  \,---.' .' |,---.'   |;   :    \.'___,/    ,'
 *               |   | .\ :.   ;   /  ` ;|   |  |: ||   |   .'|   | .\ :|    :     |
 *               .   : |: |;   |  ; \ ; |:   :  :  /:   :  |-,.   : |: |;    |.';  ;
 *               |   |  \ :|   :  | ; | ':   |    ; :   |  ;/||   |  \ :`----'  |  |
 *               |   : .  /.   |  ' ' ' :|   :     \|   :   .'|   : .  /    '   :  ;
 *               ;   | |  \'   ;  \; /  ||   |   . ||   |  |-,;   | |  \    |   |  '
 *               |   | ;\  \\   \  ',  / '   :  '; |'   :  ;/||   | ;\  \   '   :  |
 *               :   ' | \.' ;   :    /  |   |  | ; |   |    \:   ' | \.'   ;   |.'
 *               :   : :-'    \   \ .'   |   :   /  |   :   .':   : :-'     '---'
 *               |   |.'       `---`     |   | ,'   |   | ,'  |   |.'
 *               `---'                   `----'     `----'    `---'
*/

public class Node implements Comparable<Node>{
    //private variables as these should not change once set
    //frequency of character stored as an int called freq
    private int freq;
    //The character in the leaves of the tree is stored as a char called value
    private char value;

    //variables are set as public as they will change over time
    //declars a left and right Node that can be manipulated by the user
    public Node leftNode;
    public Node rightNode;

    /**Get the frequency of the object and returns it
     * @return return an int of the frequency of the node*/
    public int getFreq(){return this.freq;}


    /**Gets the value variable and returns it
     * @return returns a char of the value stored in the node*/
    public char getValue(){return this.value;}

    /** Checks of the part of the trie you are accessing is a leaf
     * @return return the boolean true if the node has a null leftNode and rightNode. Otherwise it returns false*/
    public boolean isLeaf()
    {
        if(this.leftNode == null && this.rightNode == null)
        {
            return true;
        }else
        {
            return false;
        }
    }

    /** Constructs a node with only the frequency
     * @param n int of the frequency you would like to set*/
    public Node (int n) {
        this.freq = n;
    }

    /** Constucts a node with the specific character and the frequency of the character
     * @param a char value that will be saved as the value of the leaf or node
     * @param n int value that will be saved as the frequency of the value*/
    public Node (char a, int n) {
        this.value = a;
        this.freq = n;
    }

    /** Constucts a node with the value, freq, leftNode, and rightNode
     * @param a char value that will be set as the value
     * @param n int value that will be set as the frequency
     * @param left Node value that will be set as the left node
     * @param right Node value that will be set as the right node*/
    public Node (char a, int n, Node left, Node right) {
        this.value = a;
        this.freq = n;
        this.leftNode = left;
        this.rightNode = right;
    }

    /** sets the frequency with given value
     * @param n int value that will be set as the frequency(freq)*/
    public void setFreq (int n) {
        this.freq = n;
    }
    /** Changes the value of the node
     * @param a char value that will be the new value of the value*/
    public void setValue (char a) {
        this.value = a;
    }

//Required to make the nodes work with comparable

    /**Checks if frequecy is equal to passed in node
     * @param other Node value that you would like to compare the freq of
     * @return boolean that returns true if the freq are equal and false otherwise*/
    public boolean equals(Node other)
    {
        return this.getFreq() == other.getFreq();
    }

    /**Compares the frequecy of 2 nodes and returns an int
     * @param other Node value of the node you are comparing it to
     * @return return 0 if nodes have an equal freq 1 if the other node is smaller and -1 if the other node is bigger*/
    public int compareTo(Node other)
    {
        if(this.equals(other))
            return 0;
        else if(getFreq() >other.getFreq())
            return 1;
        else
            return -1;
    }
}

