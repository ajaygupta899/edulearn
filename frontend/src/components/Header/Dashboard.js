import React from "react";
import StudentDashboard from "../Student/StudentDashboard";
const Dashboard = () => {
  const loggedInUser = localStorage.getItem("userid");
  if (!loggedInUser) {
    alert("Login required");
    window.location.href = "/";
  } else if (loggedInUser != 1) {
    window.location.href = "/";
  } else {
    return (
      <div>
        <p>Welcome to your Dashboard</p>
        <StudentDashboard />
      </div>
    );
  }
};
export default Dashboard;
