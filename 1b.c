#include <stdio.h>
#include <stdlib.h>
#define SIZE 100
void enqueue();
void dequeue();
void show();
int inp_arr[SIZE];
int rear = -1;
int front = -1;
int i;
int main() {
int ch;
clrscr();
while (1) {
printf("1. Enqueue operation\n");
printf("2. Dequeue operation\n");
printf("3. Display operation\n");
printf("4. Exit\n");
printf("Enter your choice of operation: ");
scanf("%d", &ch);
switch (ch) {
case 1:
enqueue();
break;
case 2:
dequeue();
break;
case 3:
show();
break;
case 4:
exit(0);
default:
printf("\nIncorrect choice\n");
}
}
}
void enqueue() {
int insert_item;
if (rear == SIZE - 1) {
printf("overflow \n");
} else
{
if (front == -1) {
front = 0;
}
printf("Element to be inserted in the queue: ");
scanf("%d", &insert_item);
rear = rear + 1;
inp_arr[rear] = insert_item;
}
}
void dequeue() {
if (front == -1 || front > rear) {
printf("Underflow\n");
return;
} else
{
printf("Element deleted from the queue: %d\n", inp_arr[front]);
if (front == rear) {
front = -1;
rear = -1;
} else {
front = front + 1;
}
}
}
void show() {
if (front == -1) {
printf("Empty queue\n");
} else
{
printf("Queue: ");
for (i = front; i <= rear; i++) {
printf("%d ", inp_arr[i]);
}
printf("\n");
getch();
}
}
