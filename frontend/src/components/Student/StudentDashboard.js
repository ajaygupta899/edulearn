import React from "react";
import "./Stdash.css";
import MainContent from "./MainContent";
import Sidebar from "./Sidebar";

const StudentDashboard = () => {
  return (
    <div className="Stdash">
      <div className="Glass1">
        <Sidebar />
        <MainContent />
      </div>
    </div>
  );
};

export default StudentDashboard;
