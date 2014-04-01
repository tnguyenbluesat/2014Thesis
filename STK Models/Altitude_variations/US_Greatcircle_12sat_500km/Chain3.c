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
    Object  Satellite/500km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/500km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/500km_p1_1/Receiver/adsb_satrcvr2 To Satellite/500km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1105.8035532236252
    Stop     1786.1991323616885
    Start    7007.1648642838672
    Stop     7521.6143930857397
    Start    12881.848212524585
    Stop     13175.599141164661
    Start    18799.597299377849
    Stop     18840.553873178844
    Start    68666.043867751039
    Stop     69251.504683562249
    Start    74426.807964483363
    Stop     75133.831765654773
    Start    80322.087041380408
    Stop     80835.577172478836
    Start    86256.103692480334
    Stop     86478.094185735245
    Start    262460.38303245115
    Stop     262584.12410610483
    Start    268335.32182755118
    Stop     268671.45304595912
    Start    274246.79457900784
    Stop     274688.84921630606
    Start    335776.24047029408
    Stop     336025.52743290173
    Start    341706.93978710065
    Stop     342224.21956651192
    Start    347611.43161396281
    Stop     348295.0491933095
    Start    353486.50189069327
    Stop     354143.35413317743
    Start    359396.05415146484
    Stop     359761.57765701419
    Start    415052.25272190117
    Stop     415727.01521616126
    Start    420922.9459502041
    Stop     421076.20278253598
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

