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
    Start    1111.8621461250953
    Stop     1747.3241815560282
    Start    6945.750752656073
    Stop     7423.6400118081474
    Start    12753.91270127688
    Stop     13016.659654234058
    Start    18607.55210709673
    Stop     18619.151563782387
    Start    67975.010565923367
    Stop     68437.929919498842
    Start    73611.901559108621
    Stop     74286.529128300259
    Start    79428.227425864272
    Stop     79938.33951432287
    Start    85295.964747937047
    Stop     85523.456764933653
    Start    265334.36504183168
    Stop     265525.70673355961
    Start    271149.44394475326
    Stop     271526.14096447319
    Start    337843.24987866479
    Stop     338211.90223375731
    Start    343705.22193105228
    Stop     344224.01480584836
    Start    349528.00973448646
    Stop     350207.39766308729
    Start    355338.4250528324
    Stop     355873.01251611352
    Start    361248.46454917348
    Stop     361431.36256252031
    Start    416185.25260111166
    Stop     416869.42449191655
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

