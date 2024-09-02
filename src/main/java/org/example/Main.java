package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Queue<String> queue = new LinkedList<>();
        queue.offer("bharath");
        queue.offer("rafi");
        queue.add("new");
        queue.add("TTTT");
      Queue<String> name= new LinkedList<>();
        queue.offer("new");
        queue.offer("what");
      //queue.remove();
        queue.addAll(name);
        System.out.println(queue);
       Iterator<String> it = queue.iterator();
       while (it.hasNext()){
        System.out.println(it.next());
       }
      PriorityQueue<String> pqs = new PriorityQueue<>();
       pqs.offer("bharath");
       pqs.offer("asdasd");
       pqs.offer("rafi");
       pqs.offer("abhi");
       pqs.offer("aaa");
       pqs.offer("b");
        pqs.add("a");
      PriorityQueue<String> ppq = new PriorityQueue<>();
      int i = ppq.size();
      ppq.offer("asdaa");
     // ppq.addAll(pqs);
     //   Collections.addAll(ppq,"asda","fff","asd");
       System.out.println(pqs.peek());
       //System.out.println(pqs);
        //System.out.println(ppq);
  Iterator<String> iit =pqs.iterator();
   while(iit.hasNext()){
       System.out.println(iit.next());
   }

   ArrayDeque<Integer> adeq = new ArrayDeque<>();
   adeq.offer(5);
   adeq.addFirst(55);
   adeq.addLast(12);
   adeq.addLast(12);
   adeq.addFirst(12);
   adeq.add(15);
   adeq.offerFirst(2);
   adeq.offerLast(6);
   System.out.println(adeq);
   System.out.println(adeq.contains(6));
   System.out.println(adeq.element());
   adeq.remove(5);
   adeq.removeFirstOccurrence(12);
   adeq.removeFirst();
   adeq.addFirst(2);
   adeq.offer(12);
    //    Iterator<Integer> iter =  adeq.descendingIterator();
      //  while(iter.hasNext()){
        //  System.out.println(iter.next());}
     System.out.println(adeq);
}
}