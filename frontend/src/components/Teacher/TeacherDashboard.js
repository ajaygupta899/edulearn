import React from "react";
import "./Tdash.css";
import MainContent from "./TMainContent";
import Sidebar from "./TSideBar";
import Corner from "./TCornerbar";

const StudentDashboard = () => {
  const loggedInUser = localStorage.getItem("userid");
  if (!loggedInUser) {
    alert("Login required");
    window.location.href = "/";
  } else if (loggedInUser != 2) {
    window.location.href = "/";
  } else {
    return (
      <div className="Td">
        <div className="Tg">
          <Sidebar />
          <MainContent />
          <Corner />
        </div>
      </div>
    );
  }
};

export default StudentDashboard;
