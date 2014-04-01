stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN Chain

Name  Chain3
BEGIN Definition

   Type        Chain
   Operator    Or
   Order       1
   Recompute   Yes
   IntervalType    0
   ComputeIntervalStart    0.000000
   ComputeIntervalStop     7300800.000000
    ComputeIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

   UseSaveIntervalFile    No
   UseMinAngle     No
   UseMaxAngle     No
   UseMinLinkTime     No
   LTDelayCriterion    2.000000
   TimeConvergence     0.005000
   AbsValueConvergence 1.000000e-014
   RelValueConvergence 1.000000e-008
   MaxTimeStep         360.000000
   MinTimeStep         1.000000e-002
   UseLightTimeDelay   Yes
    DetectEventsUsingSamplesOnly No
    Object  Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
    Object  Satellite/450km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/450km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/450km_p1_1/Receiver/adsb_satrcvr2 To Satellite/450km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1111.8621461250955
    Stop     1747.3241815560268
    Start    6945.7507526560739
    Stop     7423.6400118081428
    Start    12753.912701276873
    Stop     13016.659654234052
    Start    18607.552107096722
    Stop     18619.151563782387
    Start    67975.010565923338
    Stop     68437.929919498813
    Start    73611.901559108577
    Stop     74286.529128300215
    Start    79428.227425864243
    Stop     79938.339514322841
    Start    85295.964747937018
    Stop     85523.456764933595
    Start    265334.36504183151
    Stop     265525.70673355943
    Start    271149.44394475315
    Stop     271526.14096447296
    Start    337843.24987866468
    Stop     338211.9022337572
    Start    343705.22193105216
    Stop     344224.0148058483
    Start    349528.00973448635
    Stop     350207.39766308712
    Start    355338.42505283211
    Stop     355873.01251611341
    Start    361248.46454917337
    Stop     361431.36256252025
    Start    416185.25260111148
    Stop     416869.42449191614
END StrandAccesses

   UseLoadIntervalFile    No

END Definition

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Attributes

StaticColor					#ff00ff
AnimationColor					#ffff00
AnimationLineWidth					2.000000
StaticLineWidth					3.000000

END Attributes

BEGIN Graphics
    ShowGfx                Off
    ShowStatic             Off
    ShowAnimationHighlight On
    ShowAnimationLine      On
    ShowLinkDirection      Off
END Graphics
    END Graphics
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO

END Extensions

END Chain

