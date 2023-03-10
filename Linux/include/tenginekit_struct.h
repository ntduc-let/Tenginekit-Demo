#ifndef TENGINEKIT_STRUCT
#define TENGINEKIT_STRUCT
//--------------------base struct ------------------------
struct Box {
    float x1;
    float y1;
    float x2;
    float y2;
};

struct vector2 {
    float x;
    float y;
};
//--------------------------------------------------------

//--------------------function struct ------------------------
struct FaceAttribution{
    int gender; // 0 man, 1 woman
    int glasses;
    int age;
    int smile;
    int beauty_man_look;
    int beauty_woman_look;
} ;

struct EyeInfo{
    float eye_landmark[71 * 3];
    float eye_iris[5 * 3];
} ;

struct FaceInfo {
    Box face_box;
    float score;
    float head_x;
    float head_y;
    float head_z;
    float lefteye_close_state;
    float righteye_close_state;
    float mouth_close_state;
    float mouth_bigopen_state;
    float landmarks[212 * 2];
    float person_mark[512];
    FaceAttribution attribution;
} ;

struct FaceInfo3d {
    Box face_box;
    float landmarks3d[468 * 3];
    EyeInfo eye[2];
} ;

struct BodyInfo
{
    Box body_box;
    float score;
    float landmark[25 * 4];
} ;

struct HandInfo3d
{
    Box hand_box;
    float landmark[21 * 3];
};

struct Yolov5Info
{
    const char* obj_name;
    Box obj_box;
    float score;
};



//--------------------------------------------------------

//--------------------output struct ------------------------
struct sdkFaces {
    int face_count = 0;
    FaceInfo* info;
} ;

struct sdkFaces3d {
    int face3d_count;
    FaceInfo3d* info;
} ;

struct sdkBody {
    int body_count = 0;
    BodyInfo* info;
} ;


struct sdkHand3d
{
    int hand_count = 0;
    HandInfo3d* info;
} ;

struct sdkYolov5 {
    int object_count = 0;
    Yolov5Info* info;
};

//--------------------------------------------------------
#endif