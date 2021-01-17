#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(int argc,char ** argv)
{
    char str[200] = {"D:\\Tools\\Java\\jdk1.8.0_271\\bin\\java.exe -jar D:\\Tools\\fanyi\\fanyi.jar "};
    char content[200] = {0};
    int i;
    for( i = 1; i < argc; i++)
    {
       strcat(content,argv[i]);
       strcat(content," ");
    }
    printf("%s\n",content);
    strcat(str,content);
	system(str);
	system("pause");
    return 0;
}
