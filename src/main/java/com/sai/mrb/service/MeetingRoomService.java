/**
 * 
 */
package com.sai.mrb.service;

import java.util.List;

import com.sai.mrb.model.MeetingRoom;

/**
 * @author sv
 *
 */
public interface MeetingRoomService {

	public void addMeetingRoom(MeetingRoom meetingRoom);

	public void updateMeetingRoom(MeetingRoom meetingRoom);

	public MeetingRoom getMeetingRoomWithID(MeetingRoom meetingRoom);

	public List<MeetingRoom> getAllMeetingRoom();

}
