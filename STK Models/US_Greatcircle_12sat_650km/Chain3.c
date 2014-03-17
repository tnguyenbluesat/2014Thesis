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
    Object  Satellite/650km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/650km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/650km_p1_1/Receiver/adsb_satrcvr2 To Satellite/650km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1092.1575295265241
    Stop     1899.1994250865619
    Start    7197.1389488821178
    Stop     7814.1068904827571
    Start    13272.578291744412
    Stop     13652.353780694229
    Start    19386.621985356483
    Stop     19506.584508422013
    Start    70883.353061972797
    Stop     71678.86628766646
    Start    76910.81157110694
    Stop     77678.90295078652
    Start    83034.395547218621
    Stop     83534.30365722251
    Start    89161.598831669471
    Stop     89356.291914335656
    Start    189402.01773171665
    Stop     189475.97863373382
    Start    259183.84102312723
    Stop     259271.84029860538
    Start    265274.66056332691
    Stop     265609.88858134084
    Start    271351.85529009532
    Stop     271894.42645643232
    Start    277530.70637068962
    Stop     277934.06213087094
    Start    335095.89879180951
    Stop     335313.07626363152
    Start    341132.25082625332
    Stop     341761.34409030364
    Start    347246.12403876294
    Stop     348040.60324230115
    Start    353324.16395200626
    Stop     354102.53775519546
    Start    359419.80940590531
    Stop     359907.94070079771
    Start    416961.24064450531
    Stop     417807.57455803879
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

