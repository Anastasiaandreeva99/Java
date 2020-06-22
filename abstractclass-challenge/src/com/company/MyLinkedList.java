package com.company;

import java.util.List;

public class MyLinkedList implements  NodeList {
  private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            root = item;
            return true;
        }
        else {
            ListItem curr = root;
            while (curr != null) {
                int compared = curr.compareTo(item);
                if (compared < 0) {
                    if (curr.next != null) curr = curr.next();
                    else {
                        curr.setNext(item).setPrevious(curr);
                        return true;
                    }
                }
                else if (compared > 0) {
                    if (curr.previous != null) {
                        curr.previous().setNext(item);
                        item.setPrevious(curr.previous());
                        curr.setPrevious(item);
                        item.setNext(curr);
                    } else {
                        item.setNext(root);
                        item.setPrevious(null);
                        root.setPrevious(item);
                        root = item;

                    }
                    return true;
                } else {
                    System.out.println(item.getValue() + " is already in the list");
                    return false;
                }

            }
        }
        return false;
    }



    @Override
    public boolean removeItem(ListItem item) {
        ListItem current = root;
        while(current.compareTo(item)!=0 && current!=null) {
            current = current.next();
        }
        if(current==root)
        {
          root=current.next();
          root.next().setPrevious(null);
          return true;
        }
        else if(current==null)
        {
            System.out.println("The item is not in the list");
            return false;
        }
        else {
            current.previous().setNext(current.next());
            current.next().setPrevious(current.previous());
            return true;
        }
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null)System.out.println("The List is empty");
        else {
            while (root != null) {
                System.out.println("Value:" + root.getValue());
                root = root.next();
            }
        }
    }
}
