#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <fstream>
using namespace std;

// 基类
class Person {
public:
    virtual void displayInfo() = 0; // 纯虚函数
};

// 派生类
class Student : public Person {
public:
    int id;
    string name;
    string gender;
    int age;
    string phone;
    float score;

    Student(int id, string name, string gender, int age, string phone, float score)
    {
        this->id = id;
        this->name = name;
        this->gender = gender;
        this->age = age;
        this->phone = phone;
        this->score = score;
    }

    void displayInfo() override {

        cout << id << "         " << name << "        " << gender << "            " << age << "          " << phone << "      " << score << endl;

    }
};
// 管理系统菜单
void menu()
{
    system("cls");
    cout << "***********学生信息管理系统***********" << endl;
    cout << "**************************************" << endl;
    cout << "*      1-显示所有学生信息            *" << endl;
    cout << "*      2-显示排序后的学生信息        *" << endl;
    cout << "*      3-添加学生信息                *" << endl;
    cout << "*      4-查询id为x的学生信息         *" << endl;
    cout << "*      5-查询姓名为x的学生信息       *" << endl;
    cout << "*      6.系统已录入学生数量          *" << endl;
    cout << "*      7.删除学号为x的学生信息       *" << endl;
    cout << "*      8.修改学号为x的学生信息       *" << endl;
    cout << "*                                    *" << endl;
    cout << "*      *-系统菜单                    *" << endl;
    cout << "*      0-退出(功能选项内可退回菜单)  *" << endl;
    cout << "**************************************" << endl;
    cout << "输入你的选择"<<endl;

    system("pause>nul"); 

}


//顺序存储类模板，使用vector容器根据需要动态调整存储空间的大小。它会自动管理内存，无需手动分配和释放内存
template <typename T>
class SeqList {
public:
    vector<T> data;
    string fileName = "F:\students.txt";

    //SeqList构造函数 将一个vector空对象赋值给data
    SeqList() {
        data = vector<T>();
    }
    //在容器尾部加入新数据,并将数据保存到文件students.txt中
    void add(const T& item) {
        data.push_back(item);
        saveToFile(data);
    }
    
  //根据id查找下标索引
    int findIndexById(const SeqList<Student>& students, int id) {
        for (int i = 0; i < students.size(); ++i) {
            if (students[i].id == id) {
                return i; // 返回匹配到的索引
            }
        }
        return -1; // 没有找到匹配的元素，返回 -1 表示未找到
    };

    //根据索引修改数据，并将数据保存到文件students.txt中
    void modify(int index, const T& newItem) {
        if (index >= 0 && index < data.size()) {
            data[index] = newItem;
            saveToFile(data);            
        }
    }

    //根据索引删除学生信息，并同步文件数据
    void remove(int index) {
        if (index >= 0 && index < data.size()) {
            data.erase(data.begin() + index);
            saveToFile(data);
        }
    }

    // 以只读方式通过索引访问 data 中的元素。使用常量引用作为返回类型可以提高性能，
    const T& operator[](int index) const {
        return data[index];
    }

    //容器大小（学生信息数量）
    int size() const {
        return data.size();
    }
    //显示全部学生信息
    void displayAll() {
       
        cout << "学号          姓名        性别         年龄          电话           成绩 " << endl;
        // for - each 循环。它用于遍历容器中的元素，并将每个元素依次赋值给循环变量 item。
        for (T& item : data) {

            item.displayInfo();
        }
    }
    // 快速排序算法
    void quickSort(vector<T>& data, int left, int right) {
        if (left >= right) {
            return;
        }


        int pivotIndex = left + (right - left) / 2;
        T pivot = data[pivotIndex];
        int i = left;
        int j = right;

        while (i <= j) {
            while (data[i].score > pivot.score) {
                i++;
            }
            while (data[j].score < pivot.score) {
                j--;
            }
            if (i <= j) {
                swap(data[i], data[j]);
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(data, left, j);
        }
        if (i < right) {
            quickSort(data, i, right);
        }
    }
    //调用快速排序并打印
    void sortByScore() {
        quickSort(data, 0, data.size() - 1);
        displayAll();
    }
    //按照id进行查询学生信息，使用了折半查找算法，const 只读，防止被修改，data中是多个Student对象，返回类型是vector<T>
    vector<T> searchById(int id) {
        vector<T> result;

        // 确保 data 向量已经按照 id 的顺序进行排序
        sort(data.begin(), data.end(), [](const T& a, const T& b) {
            return a.id < b.id;
            });

        int left = 0;
        int right = data.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (data[mid].id == id)
            {
                // 找到匹配的元素
                result.push_back(data[mid]);
                break;
            }
            else if (data[mid].id < id)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        
        return result;
    }
    //按照姓名进行查询学生信息，使用了折半查找算法，返回类型是vector<T>
    vector<T> searchByName(const string& name) {
        vector<T> result;

        // 确保 data 向量已经按照姓名的顺序进行排序
        sort(data.begin(), data.end(), [](const T& a, const T& b) {
            return a.name < b.name;
            });

        int left = 0;
        int right = data.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (data[mid].name == name)
            {
                // 找到匹配的元素
                result.push_back(data[mid]);
                break;
            }
            else if (data[mid].name < name)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return result;
    }
    // 从文件中加载学生信息
    void loadFromFile(vector<T>& data) {
        ifstream file(fileName);
        if (file.is_open()) {
            data.clear();
            int id, age;
            string name, gender, phone;
            float score;
           // 尝试从文件中读取数据并将其存储在变量中。如果读取成功，则条件为真，循环继续执行；
           // 如果读取失败（例如已到达文件末尾），则条件为假，循环结束。
            while (file >> id >> name >> gender >> age >> phone >> score) {
               
                //emplace_back() 将读取到的字段值构造成一个新的对象，并将该对象添加到向量 data 的末尾
                data.emplace_back(id, name, gender, age, phone, score);
            }
            file.close();
        }
    }

    // 将学生信息保存到文件
    void saveToFile(vector<T>& data) {
        ofstream file(fileName);
        if (file.is_open()) {
            for (const auto& student : data) {
                file << student.id << " " << student.name << " " << student.gender << " "
                    << student.age << " " << student.phone << " " << student.score << endl;
            }
            file.close();
        }
    }
 };

    int main()
    {
        menu();
        string fileName = "F:\students.txt";
        SeqList<Student> students;
        students.loadFromFile(students.data);
        char flag;
        int f = 1;
        while (f)
        {
            cin >> flag;
            switch (flag)
            {
            case '*': {
                menu();
                break; 
               }
            case '0': {
                f = 0;
                break;
            }
            case '1': {
                // 显示所有学生信息
                cout << "所有学生信息:" << endl;               
                students.displayAll();
                break;
            }
            case '2': {
                // 显示排序后学生信息
                cout << "对成绩排序后:" << endl;                
                students.sortByScore();
                break;
            }
            case '3': {
                // 添加学生信息
                int id;
                string name;
                string gender;
                int age;
                string phone;
                float score;
                cout << "添加学生信息:" << endl;
                cout << "输入学号: ";
                cin >> id;
                int r = students.findIndexById(students, id);
                if (r != -1) {
                    flag = '*';
                    cout << "该学生信息已存在！已退回菜单，请您重新选择！" << endl;
                    break;  // 判断存入学号学生信息是否存在
                }
                else if(id == 0){
                    flag = '*';
                    cout << "已退回菜单，请您重新选择！" << endl;
                    break;  // 返回菜单
                }cout << endl;

                cout << "输入姓名: ";
                cin >> name;
                cout << endl;

                cout << "输入性别: ";
                cin >> gender;
                cout << endl;

                cout << "输入年龄: ";
                cin >> age;
                cout << endl;

                cout << "输入电话: ";
                cin >> phone;
                cout << endl;

                cout << "输入成绩: ";
                cin >> score;
                cout << endl;
               
                Student s(id, name, gender, age, phone, score);
                students.add(s);
                cout << "添加成功，已返回菜单！" << endl;
                break;
            }
            case '4': {
                // 查询id为x的学生              
                int x;
                cout << "输入查询学生学号:";
                cin >> x;
                if (x == 0) {
                    flag = '*'; 
                    cout << "已退回菜单，请您重新选择！" << endl;
                    break;
                }
                vector<Student> result = students.searchById(x);
                if (!result.empty()) {
                    for (const Student& student : result) {
                        cout << "学号          姓名        性别         年龄          电话           成绩 " << endl;
                        cout << student.id << "         " << student.name << "        "
                            << student.gender << "            " << student.age << "          "
                            << student.phone << "      " << student.score << endl;
                    }
                    cout << "查询成功，已退回菜单！" << endl;
                }
                else
                {
                    cout << "未找到该学生，已退回菜单，请您重新选择！" << endl;
                }
                break;
            }
            case '5': {
                // 查询姓名为x的学生
             
                string x;
                cout << "输入查询学生姓名:";
                cin >> x;
                if (x == "0") {
                    flag = '*';
                    cout << "已退回菜单，请您重新选择！" << endl;
                    break;
                }
                vector<Student> result = students.searchByName(x);
                if (!result.empty()) {
                    for (const Student& student : result) {
                        cout << "学号          姓名        性别         年龄          电话           成绩 " << endl;
                        cout << student.id << "         " << student.name << "        "
                            << student.gender << "            " << student.age << "          "
                            << student.phone << "      " << student.score << endl;
                    }
                    cout << "查询成功，已退回菜单！" << endl;
                }
                else
                {
                    cout << "未找到该学生，已退回菜单，请您重新选择！" << endl;
                }
                break;
            }
            case'6': {
                //学生的数量             
                int size;
                size = students.size();
                cout << "系统记录学生数量为：" << size << "人"<<endl;
                cout << "已退回菜单！"<< endl;
                break;
            }
            case'7': {
                //删除id为xxx学生信息        
                int id;
                int i;
                cout << "输入要删除学生的学号:";
                cin >> id;
                if (id == 0) {
                    flag = '*';
                    cout << "已退回菜单，请您重新选择!" << endl;
                    break;
                }
                i = students.findIndexById(students,id);
                if (i >= 0) {
                    students.remove(i);  // 删除指定索引的学生
                    cout << "删除成功！已返回菜单" << endl;
                }
                else {
                    cout << "该学生不存在,已退回菜单" << endl;
                } 
                break;
            }
            case '8': {
                // 修改学生信息      
                int id;
                string name;
                string gender;
                int age;
                string phone;
                float score;
                cout << "输入要修改学生的学号:";
                cin >> id;
                int i = students.findIndexById(students, id);
                if (i >= 0) {
                    cout << "查找成功，请修改学生信息:" << endl;
                    cout << "输入学号: ";
                    cin >> id;
                    if (id == 0) {
                        flag = '*';
                        cout << "已退回菜单，请您重新选择！" << endl;
                        break;  // 如果学号为零，退出循环
                    }cout << endl;

                    cout << "输入姓名: ";
                    cin >> name;
                    cout << endl;

                    cout << "输入性别: ";
                    cin >> gender;
                    cout << endl;

                    cout << "输入年龄: ";
                    cin >> age;
                    cout << endl;

                    cout << "输入电话: ";
                    cin >> phone;
                    cout << endl;

                    cout << "输入成绩: ";
                    cin >> score;
                    cout << endl;
                    Student s(id, name, gender, age, phone, score);
                    students.modify(i,s);
                    cout << "修改成功！已返回菜单" << endl;
                }
                else {
                    cout << "该学生不存在,已退回菜单" << endl;
                }      
                break;
            }
            default:
                menu();
            }
        }
        return 0;
    }
