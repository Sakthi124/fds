#include <stdio.h>
#include <stdlib.h>
#define SIZE 50
int Top = -1, inp_array[SIZE];
void Push();
void Pop();
void show();
void main() {
int choice;
clrscr();
while (1) {
printf("\nOperations performed by Stack");
printf("\n1. Push the element\n2. Pop the element\n3. Show\n4. End");
printf("\n\nEnter the choice: ");
scanf("%d", &choice);
switch (choice) {
case 1:
Push();
break;
case 2:
Pop();
break;
case 3:
show();
break;
case 4:
exit(0);
default:
printf("\nInvalid choice!");
}
}
}
void Push() {
int x;
if (Top == SIZE - 1) {
printf("\nOverflow!!");
} else {
printf("\nEnter element to be inserted to the stack: ");
scanf("%d", &x);
Top = Top + 1;
inp_array[Top] = x;
}
}
void Pop() {
if (Top == -1) {
printf("\nUnderflow!!");
} else {
printf("\nPopped element: %d", inp_array[Top]);
Top = Top - 1;
}
}
void show() {
int i;
if (Top == -1) {
printf("\nUnderflow!!");
} else {
printf("\nElements present in the stack: ");
for (i = Top; i >= 0; i--) {
printf("%d ", inp_array[i]);
}
}
}
